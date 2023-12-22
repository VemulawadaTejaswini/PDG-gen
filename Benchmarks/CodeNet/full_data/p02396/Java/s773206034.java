import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int[] num = new int[10000];
	int i=0,cnt=0;
	while(true){ 
	    num[i]=in.nextInt();
	    if(num[i]==0)break;
	    i++;
	    cnt++;
	}
	for(i=1;i<=cnt;i++){
	    System.out.println("Case"+ i +":"+num[i-1]);
	}
    }
}

