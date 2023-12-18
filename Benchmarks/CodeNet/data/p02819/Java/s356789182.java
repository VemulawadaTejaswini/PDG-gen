public static void main(String[] args) {
　　　　　　Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           while(!isprime(n)){
               n++;
           }
           System.out.println(n);
      }