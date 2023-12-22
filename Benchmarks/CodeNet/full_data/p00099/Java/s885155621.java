import java.util.*;
import java.io.*;

class FishingData implements Comparable<FishingData> {

    final int id;
    int no;

    FishingData( final int id ) {
	this.id = id;
    }

    FishingData( final int id, final int no ) {
	this.id = id;
	this.no = no;
    }

    public int compareTo( FishingData fd ) {
	if ( no != fd.no ) {
	    return no - fd.no;
	} else {
	    return fd.id - id;
	}
    }	
}

class MaxContainer {

    final TreeSet<FishingData> set;
    final HashMap<Integer, FishingData> map;
    
    public MaxContainer() {
	set = new TreeSet<FishingData>();
	map = new HashMap<Integer, FishingData>();
    }

    public FishingData getMaxData() {
	return set.last();
    }

    public void catchEvent( final int id, final int diff ) {
	if ( map.containsKey( id ) ) {
	    final FishingData fd = map.get( id );
	    set.remove( fd );
	    fd.no += diff;
	    set.add( fd );
	} else {
	    final FishingData fd = new FishingData( id, diff );
	    map.put( id, fd );
	    set.add( fd );
	}
    }
}

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	final int n = stdin.nextInt();
	final int q = stdin.nextInt();
	MaxContainer mc = new MaxContainer();

	for ( int i = 0; i < q; i++ ) {
	    final int id = stdin.nextInt();
	    final int vol = stdin.nextInt();
	    
	    mc.catchEvent( id, vol );
	    final FishingData maxFd = mc.getMaxData();
	    System.out.printf( "%d %d\n", maxFd.id, maxFd.no );
	}	
    }    
}