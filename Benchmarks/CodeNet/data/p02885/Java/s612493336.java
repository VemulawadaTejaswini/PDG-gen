public static void main(String[] args) {
        int A,B;
        Scanner in=new Scanner(System.in);
        A=in.nextInt();
        B=in.nextInt();
        if (A>2*B)
        {
            System.out.println(A-2*B);
        }
        else
        {
            System.out.println(0);
        }
    }