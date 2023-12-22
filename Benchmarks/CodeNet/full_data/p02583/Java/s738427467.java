import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      	int ans = 0;
      	Arrays.sort(a);
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
            for(int k=j+1;k<a.length;k++){
              if( (a[i]!=a[j])&&(a[j]!=a[k])&&(a[i]!=a[k])&&(a[i]+a[j]>a[k])&&(a[i]+a[k]>a[j])&&(a[j]+a[k]>a[i])){
                ans++;
                System.out.println(i+":"+j+":"+k);
              }
            }
          }
        }
      /*
      	int count = 1;
      	for(int i=1;i<n;i++){
          if(a[i]!=a[i-1]){
            count++;
          }
        }
      	int[] num = new int[count];
      	num[0] = a[0];
      	count = 1;
      	for(int i=1;i<n;i++){
          if(a[i]!=a[i-1]){
            num[count] = a[i];
            //System.out.println(num[count-1]);
            count++;
            
          }
        }
      	for(int i=0;i<num.length;i++){
          for(int j=i+1;j<num.length;j++){
            for(int k=j+1;k<num.length;k++){
              if( (i!=j)&&(j!=k)&&(i!=k)&&(num[i]+num[j]>num[k])&&(num[i]+num[k]>num[j])&&(num[j]+num[k]>num[i])){
                ans++;
              }
            }
          }
        }
        */
      System.out.println(ans);
	}
}