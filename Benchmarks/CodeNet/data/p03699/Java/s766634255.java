import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        int arr[]  =new int[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(in.nextLine());
        }
        Program obj = new Program(arr,n);
        System.out.println(obj.find());           
    }
}
class Program{
    int arr[],n,max; ArrayList<Integer> set;
    Program(int arr[],int n){
        this.arr = arr; this.n = n; max = 0;set = new ArrayList<Integer>();
    }
    int find(){
        powerset(0);
        return max;
    }
    void powerset(int i){
        if(i==n) {
            if (sum()%10!=0) max = max>sum()?max:sum();
        }
        else{
            powerset(i+1);
            set.add(arr[i]);
            powerset(i+1);
            set.remove(set.size()-1);
        }
    }
    int sum(){
        int sum = 0;
        for(int var:set) sum+=var;
        return sum;
    }
}