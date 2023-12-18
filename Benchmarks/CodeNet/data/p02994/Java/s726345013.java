import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
        int b = sc.nextInt();
		int c = 0;
        for(int i=0;i<a;i++){c+=b+i;
                            }
        if(b*(b+a-1)>0){if(b>0){c-=b;}else{c-=b+a-1;}}
		System.out.println(c);
	}
}
