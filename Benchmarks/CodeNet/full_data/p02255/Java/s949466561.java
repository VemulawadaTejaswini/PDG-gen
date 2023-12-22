import java.util.Scanner;

class InsertionSort{
 public static void main(Stirng[] args){
  Scanner sc = new Scanner(System.in);
  
  int N = sc.nextInt();
  int[] a = new int[N];
  for(int i = 0; i < a.length; i++)
   a[i] = sc.nextInt();

  for(int i = 1; i <= N - 1; i++){
   int v = a[i];
   int j = i - 1;
   while((j >= 0) && (a[j] > v)){
    a[j + 1] = a[j];
    j --;
    a[j + 1] = v;
   }
  }
 }
}
