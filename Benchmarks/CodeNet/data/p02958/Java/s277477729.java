import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = 0;
		for(int i=0;i<a;i++){int c = sc.nextInt();
                            if(c!=i+1){b++;}
                            }     
        if(b<=2){System.out.println("YES");}
		else{System.out.println("NO");}
	}
}
