import java.util.*;
class Main
{
    public static void main(String[] ards)
    {
	Scanner sc=new Scanner(System.in);
	while(true){
	    int cards=sc.nextInt();
	    int shuffle=sc.nextInt();
	    if(cards==0&&shuffle==0)break;
	    LinkedList<Integer> list=new LinkedList<Integer>();
	    for(int i=1;i<=cards;i++){
		list.addFirst(i);
	    }
	    for(int i=0;i<shuffle;i++){
		LinkedList<Integer> temp=new LinkedList<Integer>();
		int p=sc.nextInt()-1;
		int c=sc.nextInt();
		for(int j=0;j<c;j++){
		    temp.addFirst(list.get(p));
		    list.remove(p);
		}
		for(int j=0;j<c;j++){
		    list.addFirst(temp.poll());
		}
	    }
	    System.out.println(list.getFirst());
	}
    }
}