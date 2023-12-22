import java.util.*;

public class Main {
    int cnt=0;
    
	
	    int[] insertionSort(int[]lst,int g){
        int n=lst.length;
        for(int i=g;i<n;i++){
            int v=lst[i];
            for(int j=i-g;j>=0;j-=g){
                if(lst[j]>v){
                    lst[j+g]=lst[j];lst[j]=v;cnt++;
                }
                else{break;}
            }
        }
        return lst;
    }
	
	static List<Integer> g_lst = new LinkedList<Integer>();
	
	int[] shellSort(int[] lst){
		for(int i:g_lst){
			insertionSort(lst,i);
		}
		return lst;
	}
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),x=1;
        g_lst.add(1);
        while(3*x+1<n){x=3*x+1;g_lst.add(0,x);}
	    int[] lst = new int[n];
	    for(int i=0;i<n;i++){lst[i]=sc.nextInt();}
	    Main m= new Main();
	    lst=m.shellSort(lst);
	    System.out.println(g_lst.size());
	    for(int i=0;i<g_lst.size();i++){
	        if(i==0){System.out.printf("%d",g_lst.get(i));continue;}
	        System.out.printf(" %d",g_lst.get(i));
		}
		System.out.println();
	    System.out.println(m.cnt);
	    for(int i=0;i<n;i++){System.out.println(lst[i]);};
	}
}
