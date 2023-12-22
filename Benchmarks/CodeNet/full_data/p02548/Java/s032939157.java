import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        
        int count=0;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
                
                    
                    if( binarySearch(arr,0,n-1,n-(i*j))!=-1)
                    {
                        
                        count++;
                    }
               
            }
        }
        System.out.println(count);
    }
    public static int binarySearch(int[] arr,int l,int r,int x)
    {
    
        
    



       
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        
        if (arr[mid] == x) 
            return mid; 
  
        
        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 
  
        return binarySearch(arr, mid + 1, r, x); 
    } 
  
    
    return -1; 

       
    }
}