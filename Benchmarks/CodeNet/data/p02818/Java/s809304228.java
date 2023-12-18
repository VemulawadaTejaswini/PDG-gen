import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = sc.nextLong();
		Long c = sc.nextLong();
        for(int i=0;i<c;i++){if(a<0){a--;
                                    }else{if(b<0){b--;}}
                            }       
		System.out.println(a + " " + b);
	}
}
