import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[] arr = new int[m];
    for(int i=1;i<=m;i++){
      arr[i]=i;
    }
    ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
    ArrayList<Integer> data = new ArrayList<Integer>();
    combinationUtil(arr,m,n,0,data,0,arr1);
    ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
    for(int i=0;i<q;i++){
      ArrayList<Integer> f = new ArrayList<>();
      for(int p=0;p<3;p++){
        f.add(sc.nextInt());
      }
    }
    int max= Integer.MIN_VALUE;
    for(int i1=0;i1<arr1.size();i1++){
      int score=0;
      ArrayList<Integer> j = arr1.get(i1);
      for(int i2=0;i2<arr2.size();i2++){
        ArrayList<Integer> h = arr2.get(i2);
        if(j.get(h.get(0))-j.get(h.get(1))==h.get(2)){
          score=score+h.get(3);
        }
      }
      if(score>max){
        max=score;
      }
    }
    System.out.println(max);
  }
  static void combinationUtil(int arr[], int n, int r, int index, 
                                ArrayList<Integer> data, int i,ArrayList<ArrayList<Integer>> arr1) 
    { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        { 
            //for (int j=0; j<r; j++) 
             //   System.out.print(data[j]+" "); 
            //System.out.println("");
            arr1.add(data);
        return; 
        } 
  
        // When no more elements are there to put in data[] 
        if (i >= n) 
        return; 
  
        // current is included, put next at next location 
        //data[index] = arr[i];
        data.add(index,arr[i]);
        combinationUtil(arr, n, r, index+1, data, i+1); 
  
        // current is excluded, replace it with next (Note that 
        // i+1 is passed, but index is not changed) 
        combinationUtil(arr, n, r, index, data, i+1); 
    } 
  
    // The main function that prints all combinations of size r 
    // in arr[] of size n. This function mainly uses combinationUtil() 
}