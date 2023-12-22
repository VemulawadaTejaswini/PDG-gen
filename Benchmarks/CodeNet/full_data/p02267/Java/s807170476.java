import java.util.*;
// import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int number = 0;
    // int n = Integer.parseInt(br.readLine());
    int n = sc.nextInt();
    // String [] S = br.readLine().split("\\s+");
    long [] array_s = new long[n];
    for(int i =0; i<n; i++){
      array_s[i] = sc.nextLong();
    }

    // int q = Integer.parseInt(br.readLine());
    int q = sc.nextInt();
    // String [] T = br.readLine().split("\\s+");
    long [] array_t = new long[n];
    long t;
    for(int i = 0; i<q; i++){
      t = sc.nextLong();
      for(int j = 0; j<n; j++){
        if(t == array_s[j]){
          count++;
          break;
        }
      }
    }

    System.out.println(count);
  }
}
