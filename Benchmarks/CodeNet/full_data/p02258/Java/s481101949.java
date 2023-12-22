import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(scan.nextLine());
        }
        
        int[] max = new int[n-1];
        int[] min = new int[n-1];
        int[] dif = new int[n-1];

        for(int i=0; i<n-1; i++){
            if(i==0){min[0]=a[0];}
            else{min[i] = Math.min(min[i-1], a[i]);}
        }    
        
        for(int i=n-2; i>=0; i--){
            if(i==n-2){max[n-2]=a[n-1];}
            else{max[i] = Math.max(max[i+1], a[i+1]);}  
        }   
        
        for(int i=0; i<n-1; i++){
            dif[i] = max[i]-min[i];  
        }
        
        int maximum = -1000000000;
        
        for(int i=0; i<n-1; i++){
            maximum = Math.max(maximum, dif[i]);
        }
        
        System.out.println(maximum);
    }
    
}