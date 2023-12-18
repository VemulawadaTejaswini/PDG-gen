import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),count1=0,count2=0,count3=0;
    for(int i=0;i<n;i++) {
    	int buff=sc.nextInt();
    	if(buff<=a) {
    		count1++;
    	}else if(buff<=b) {
    		count2++;
    	}else {
    		count3++;
    	}
    }
    System.out.println((int)Math.min(count1, Math.min(count2, count3)));
  }
}
