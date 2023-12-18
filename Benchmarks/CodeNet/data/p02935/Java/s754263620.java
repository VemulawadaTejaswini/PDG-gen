import java.util.*;

public class Main{
	public static void main(String args[]){
	  Scanner sc = new Scanner(Syatem.in);
      int n = sc.nextInt();
      double v[] = new double[n];
      double temp;
      for(int i = 0; i < n; i++){
        v[i] = sc.nextDouble();
      }
      for(int j = 0; j < n-1; j++){
        for(int k = 0; k < n-1; k++){
          if(v[k] > v[k+1]){
            temp = v[k];
            v[k] = v[k+1];
            v[k+1] = temp;
          }
        }
      }
      for(int l = 0; l < n-1; l++){
        v[l+1] = (v[l]+v[l+1])/2;
      }
      System.out.println(v[n-1]);
	}
}