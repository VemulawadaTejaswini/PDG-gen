import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[] arr = new int[m];
    for(int i=0;i<m;i++){
      arr[i]=i+1;
    }
    ArrayList<int[]> arr1 = new ArrayList<>();
    int[] data = new int[n];
    combinationUtil(arr,m,n,0,data,0,arr1);
    ArrayList<int[]> arr2 = new ArrayList<>();
    for(int i=0;i<q;i++){
      int[] f = new int[4];
      for(int p=0;p<4;p++){
        f[p]=sc.nextInt();
      }
      arr2.add(f);
    }
    int max= Integer.MIN_VALUE;
    for(int i1=0;i1<arr1.size();i1++){
      int score=0;
      int[] j = arr1.get(i1);
      // System.out.println(j.length);
      // for(int l=0;l<j.length;l++){
      //   System.out.print(j[l]+" ");
      // }
      // System.out.println();

      for(int i2=0;i2<arr2.size();i2++){
        int[] h = arr2.get(i2);
    //    System.out.println(h.length);
    //    System.out.println(h[0]+" "+h[1]+" "+h[2]+" "+j[h[0]-1]+" "+j[h[1]-1]);
        if(j[h[1]-1]-j[h[0]-1]==h[2]){
          score=score+h[3];
        }
      }
      if(score>max){
        max=score;
      }
    }
    System.out.println(max);
  }
  static void combinationUtil(int arr[], int n, int r, int index, 
                                int[] data, int i,ArrayList<int[]> arr1) 
    { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        {   int[] s = new int[r];
            for (int j=0; j<r; j++) 
                s[j]=data[j];
            arr1.add(s);
            
        return; 
        } 
  
        // When no more elements are there to put in data[] 
        if (i >= n) 
        return; 
  
        // current is included, put next at next location 
        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1,arr1); 
        // current is excluded, replace it with next (Note that 
        // i+1 is passed, but index is not changed) 
        combinationUtil(arr, n, r, index, data, i+1, arr1); 
    } 
  
    // The main function that prints all combinations of size r 
    // in arr[] of size n. This function mainly uses combinationUtil() 
}