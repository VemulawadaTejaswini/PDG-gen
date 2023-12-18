import java.util.*;


public class Main{
static Scanner sc = new Scanner(System.in);
  static int n = sc.nextInt();
  static int max=0;
  static int[] array = new int[n];
public static void main(String[] args){
  int[] set = new int[2];

for(int i=0;i<n;i++){
  array[i] = sc.nextInt();
}
for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
    if(array[i]>=array[j]){
      if(max<kaijo(array[i])/(kaijo(array[j])*kaijo(array[i]-array[j]))){
        max=kaijo(array[i])/(kaijo(array[j])*kaijo(array[i]-array[j]));
        set[0]=array[i];
        set[1]=array[j];
      }
    }
  }
}
System.out.print(set[0]);
System.out.print(" ");
System.out.print(set[1]);
}

public static int kaijo(int n){
  if(n==0){
     return 1;
   }
  int ans = 1;
  for(int i=1;i<=n;i++){
    ans *= i;
  }
  return ans;
}
}
