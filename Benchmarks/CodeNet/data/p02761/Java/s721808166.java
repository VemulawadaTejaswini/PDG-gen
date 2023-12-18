import java.util.*;
	class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt(), m = sc.nextInt();
          	int[] s = new int[m];
          int[] t= new int[m];
          for (int i = 0; i< m; i++){
          	s[i] = sc.nextInt(); t[i] = sc.nextInt();
          }
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i< m; i++)
            sb.append("0");
          for (int i = 0; i < m; i++){
          	sb.insert(s[i], t[i]);
          }
          String ss = sb.toString();
          if (ss.charAt(0) == '0')
            System.out.println(-1);
          else 
            System.out.println(ss);
        }
    }