import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=0,f=0,r=0,sum;
        String s="F";
        while(true) {
        	m=scan.nextInt();
        	f=scan.nextInt();
        	r=scan.nextInt();
        	if(m==-1 && f==-1 && r==-1) {
        		break;
        	}
        	sum=m+f;
        	if(m==-1 || f==-1 || sum<30) {
        		System.out.println("F");
        	}
        	else if(sum>=80) {
        		System.out.println("A");
        	}
        	else if(sum<80 && sum>=65) {
        		System.out.println("B");
        	}
        	else if(sum<65 && sum>=50) {
        		System.out.println("C");
        	}
        	else if(sum<50 && sum>=30) {
        		if(r>=50) {
        			System.out.println("C");
        		}
        		else{
        			System.out.println("D");
        		}
        	}
        }
    }
}

