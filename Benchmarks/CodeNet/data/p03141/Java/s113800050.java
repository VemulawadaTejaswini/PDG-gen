import java.util.*;

class Main {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  
  int N = sc.nextInt();
  int A[] = new int[N];
  int B[] = new int[N];
  for(int i = 0;i < N;i++) {
    A[i] = sc.nextInt();
    B[i] = sc.nextInt();
  }
  
  
  Dish d[] = new Dish[N];
  
  for(int i = 0;i < N;i++) {
  	d[i] = new Dish(A[i],B[i],i);
  }
  


  quick_sort(d,0,N - 1);
  

  long tSum = 0;
  long aSum = 0;
  for(int i = N - 1;i >= 0;i = i - 2){
    tSum += A[d[i].I];
  }

  for(int i = N - 2;i >= 0;i = i - 2){
    aSum += B[d[i].I];
  }
  
  
  System.out.println(tSum - aSum);
}
  
  
  
  
  static void quick_sort(Dish[] d, int left, int right) {
        if (left >=right) {
            return;
        }
        int p = d[(left+right)/2].SUM;
        int l = left, r = right;
    	Dish tmp;
        while(l<=r) {
            while(d[l].SUM < p) { l++; }
            while(d[r].SUM > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left,r );  
        quick_sort(d, l, right);
    }
  
}

class Dish {
  int A;
  int B;
  int SUM;
  int I;
  
  Dish(int A,int B,int I){
    this.A = A;
    this.B = B;
    this.SUM = A + B;
    this.I = I;
  }
}