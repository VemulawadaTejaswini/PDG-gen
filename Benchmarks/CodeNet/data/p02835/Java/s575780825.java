 int a;
        int b;
        int c;
        Scanner s= new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();

        if(a+b+c >=22){
            System.out.println("bust");
        }
        else
            System.out.println("win");