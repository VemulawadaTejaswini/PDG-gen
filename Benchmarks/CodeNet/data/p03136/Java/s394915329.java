import java.util.*; 

class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  int sum = 0;
  for(int i=0;i<n;i++) {
    arr[i]=sc.nextInt();
    }
  //array sorted hence larger number goes to end
    Arrays.sort(arr);
  for(int j=0;j<n;j++) {
    //add all number except large number
    if(j<n-1) {
      sum = sum +  arr[j];
    }
  }
//compare sum with larger number.
  if(sum > arr[arr.length-1]) {
    System.out.println("Yes");
  } else {
    System.out.println("NO");
  }
  
   
  }
  
  
}

