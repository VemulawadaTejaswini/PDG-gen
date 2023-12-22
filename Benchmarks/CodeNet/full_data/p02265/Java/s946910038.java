import java.io.*;
import java.util.*;

class Node {
	int key;
	Node next;
	Node prev;
	
	Node( int key )
	{
		this.key = key;
		this.next = null;
		this.prev = null;
	}
}
class DLL {
	int size;
	Node head;
	Node tail;

	DLL( )
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public void add( int key )
	{
		Node node = new Node( key );
		if( null == head ) {
			tail = head = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
			size++;
		}
		return;
	}
	public void delete( int key )
	{
		Node node = head;
		Node pre = null;
        while( null != node ) {
        	if( key == node.key ) {
        		if( head == node ) {
        			deleteFirst();
        			break; 
        		}
        		if( tail == node ) {
        			deleteLast();
        			break; 
        		}
        		node = node.next;
    			pre.next = node;
    			node.prev = pre;
        		size--;
        		break;
        	}
        	pre = node;
			node = node.next;
		}
		return;
	}
	public void deleteFirst( )
	{
		head = head.next;
		if( null != head ) {
			head.prev = null;
		} else {
			tail = head;
		}
		size--;
		return;
	}
	public void deleteLast( )
	{
		tail = tail.prev;
		if( null != tail ) {
			tail.next = null;
		} else {
			head = tail;
		}
		size--;
		return;
	}
}

class Main {
    public static void main(String[] args) {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        try {
			int n = Integer.parseInt( kb.readLine() );
			
			
			String[] str;
			DLL list = new DLL( );
            for( int i=0; i<n; i++ ) {
                str = kb.readLine().split( " " );
                if( "insert".equals( str[0] ) ) {
                	list.add( Integer.parseInt( str[1] ) );
                } else if( "deleteFirst".equals( str[0] ) ) {
                	list.deleteFirst( );
                } else if( "deleteLast".equals( str[0] ) ) {
                	list.deleteLast( );
                } else {
                	list.delete( Integer.parseInt( str[1] ) );
                }
            }
            
			StringBuilder output = new  StringBuilder( );
			Node node = list.head;
            while(  null != node ) {
				output.append( node.key ).append( " " );
				node = node.next;
 			}
 			output.deleteCharAt( output.lastIndexOf( " " ) );
			System.out.println( output );

	    } catch( IOException e ) {
	        System.err.println( e );
	    }
	}
}