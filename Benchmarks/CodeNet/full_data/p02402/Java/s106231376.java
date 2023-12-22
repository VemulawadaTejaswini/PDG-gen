    import java.util.Scanner;
    class testr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int max= 0;
            int min =0;
            int sum =0;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                sum+=x;
                if(i==0) min = max = x;
                if(max<x) max = x;
                if(min> x) min =x;
            }
            System.out.print(min+" "+max+" "+sum);


        }
    }