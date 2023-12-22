import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int[] p = new int[50050];
	    p[0] = 2;
	    int num = 1;
	    for(int i=3 ; i<50050 ; i+=2){
		boolean flag = true;
		for(int j=0 ; p[j]*p[j]<=i ; j++){
		    if(i%p[j]==0){
			flag = false;
			break;
		    }
		}
		if(flag){
		    p[num] = i;
		    num++;
		}
	    }
	    while(s.hasNext()){
		int a=0;
		int c = s.nextInt();
		for(int i=0 ; p[i]<c ; i++)
		    a++;
		if(p[a]==c)
		    System.out.println(p[a-1] + " " + p[a+1]);
		else
		    System.out.println(p[a-1] + " " + p[a]);
	    }
      	}
}