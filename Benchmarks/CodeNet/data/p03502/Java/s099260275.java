import java.util.*;


public class Main100 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
				char[] Nparts = new char[N.length()];
				for(int i=0;i<N.length();i++){
						Nparts[i]= N.charAt(i);
				}

				int sum=0;

				for(int i=0;i<N.length();i++){
						sum+=Character.getNumericValue(Nparts[i]);
				}

				int Nint = Integer.parseInt(N);

				if(Nint%sum==0){
						System.out.println("Yes");
				}else{
						System.out.println("No");
				}
    }
}