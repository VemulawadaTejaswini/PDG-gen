/* ALDS1_1_A */
import java.io.*;

class Main
{

  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[n];

      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }

      insertionSort(array);

    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static void insertionSort(int[] A)
  {
    StringBuilder sb = new StringBuilder();

    for(int i = 1; i < A.length; i++){
      int v = A[i];
      int j = i - 1;
      while(j >= 0 && A[j] > v){
        A[j+1] = A[j];
        j--;
      }
      A[j+1] = v;
      sb.append(show(A));
    }
    System.out.print(sb);
  }

  public static String show(int[] B)
  {
    StringBuilder show = new StringBuilder();
    for(int i = 0; i < B.length; i++){
      show.append(B[i]).append(" ");
    }
    show.append("\n");

    return show.toString();
  }
}