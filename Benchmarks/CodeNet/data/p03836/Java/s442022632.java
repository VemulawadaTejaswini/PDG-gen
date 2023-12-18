import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
        int x = c-a;
        int y = d-b;
		String s = " ";
        
        for(int i=0;i<x;i++){s+="R";
                            }
        for(int i=0;i<y;i++){s+="U";
                              }
        for(int i=0;i<x;i++){s+="L";
                            }
        for(int i=0;i<y;i++){s+="D";
                             }
        s+="D";
        x++;
        y++;
         for(int i=0;i<x;i++){s+="R";
                            }
        for(int i=0;i<y;i++){s+="U";
                             }
        s+="LU";
        for(int i=0;i<x;i++){s+="L";
                            }
        for(int i=0;i<y;i++){s+="D";
                             }
        s+="R";
		System.out.println(s);
	}
}
