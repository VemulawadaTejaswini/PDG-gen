import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String s=("");
        String b[] = a.split("");
        String c[] = b;
        for (int i =0;i<b.length/2;i++){
        	b[i]=s;
        	b[i] = b[b.length-1-i];
        	b[b.length-1-i]=s;
        }
        
        for(int l=0;l<b.length;l++){
        	if(b[l]!=c[l]){
        		System.out.println("No");
        		System.exit(0);
        	}
        }
        System.out.println("Yes");
        

        }
	}
