import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] num;
    int n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		num = new int[n];
		for(int i=0; i<n; i++)
		    num[i] = sc.nextInt();
		sort();
	    }
	}
    }

    void sort(){
	for(int i=0; i<n; i++){
	    int j=i;
	    while(j>=1 && num[j-1]>num[j]){
		int tmp = num[j];
		num[j] = num[j-1];
		num[j-1] = tmp;
		j--;
	    }
	    show();
	}
    }

    void show(){
	StringBuffer sb = new StringBuffer();
	sb.append(num[0]);
	for(int i=1; i<num.length; i++)
	    sb.append(" "+num[i]);
	System.out.println(sb.toString());
    }
}