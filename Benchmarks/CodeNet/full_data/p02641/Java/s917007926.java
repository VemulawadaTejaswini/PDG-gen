import java.util.Scanner;
//EphSon solution

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++) {
        	p[i]=sc.nextInt();
        }
        for(int i=0;i<=100;i++) {
        	int num1=x-i,num2=x+i;
        	int count1=0,count2=0;
        	for(int j=0;j<n;j++) {
        		if(p[j]==num1)	count1++;
        		if(p[j]==num2)	count2++;
        	}
        	if(count1==0) {
        		System.out.println(num1);
        		break;
        	}else if(count2==0) {
        		System.out.println(num2);
        		break;
        	}
        }
    }
}
