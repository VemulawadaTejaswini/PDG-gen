import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;
    int number = 0;

    int n = Integer.parseInt(br.readLine());
    String [] S = br.readLine().split("\\s+");
    int [] array_s = new int[n];
    for(int i =0; i<n; i++){
      array_s[i] = Integer.parseInt(S[i]);
    }

    int q = Integer.parseInt(br.readLine());
    String [] T = br.readLine().split("\\s+");
    int [] array_t = new int[n];
    for(int i = 0; i<q; i++){
      array_t[i] = Integer.parseInt(T[i]);
    }

    for(int i =0; i<n; i++){
      for(int j = 0;j<q; j++){
        if(array_s[i] == array_t[j])count++;
      }
    }

    System.out.println(count);
  }
}
