    import java.util.Scanner;
     
    public class Main {
        static int binarySearchRightMost(int arr[],int key){
            int l=0,r=arr.length-1;
            while (l<r){
                int mid=Math.floorDiv(l+r,2);
                if(arr[mid]>key){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
            return r-1;
     
        }
     
        public static void main(String[] args) {
    //        int arr[]={1,2,3,4,4,4,6,7};
    //        System.out.println(binarySearchRightMost(arr,4));
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
    //        int arr[]=new int[b];
            for(int j=0;j<b;j++){
                a-=scanner.nextInt();
                if(a<=0){
                    System.out.println("Yes");
                    break;
                }
            }
            if(a>0){
                System.out.println("No");
            }
    //        System.out.println(a%b==0?Math.floorDiv(a,b):Math.floorDiv(a,b)+1);
        }
    }