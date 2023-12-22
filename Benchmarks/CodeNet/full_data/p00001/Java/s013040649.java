public class Main{
    
    static int[] height={1245,7756,5657,676,4546,567,23435,465656,4546,2130};
    
    public static void main(String[] args){

        for(int i=0;i<=9;i++){
            height[i]=new Scanner(System.in).nextInt();
        }
        
        //sort
        int key;
        int obj;
        
        for(key=9;key>=0;key--){
            
            for(int i=0;i<=key-1;i++){
                if(height[i]>height[i+1]){
                    swap(i,i+1);
                }
            }
            
        }
        
        System.out.println(height[9]);
        System.out.println(height[8]);
        System.out.println(height[7]);
        
        
        
    }
    
    public static void swap(int a,int b){
        int i;
        i=height[a];height[a]=height[b];height[b]=i;
    }
}