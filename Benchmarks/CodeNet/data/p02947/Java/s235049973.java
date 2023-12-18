import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      String[] s = new String[n];

      for(int i=0;i<n;i++){
        s[i] = sc.next();
      }

      long ans = 0;

      char[][] c = new char[n][10];
      for(int i=0;i<n;i++){
        for(int j=0;j<10;j++){
          c[i][j] = s[i].charAt(j);
        }
      }

      for(int i=0;i<n;i++){
        Arrays.sort(c[i]);
      }

      String[] fin = new String[n];
      for(int i=0;i<n;i++){
        fin[i] = "";
      }

      for(int i=0;i<n;i++){
        for(int j=0;j<10;j++){
            fin[i] += c[i][j];
        }
      }

//////////////////////////////////////////////

      int cnt = 1;

      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(fin[i].equals("-")){
            break;
          }
          else{
            if(fin[i].equals(fin[j])){
              fin[j] = "-";
              cnt++;
            }
          }
        }
        fin[i] = "-";
        ans += cnt*(cnt-1)/2;
        cnt = 1;
      }

      System.out.println(ans);

      /*for(int i=0;i<n;i++){
        System.out.println("fin[i]="+fin[i]);
      }*/

    }
}
