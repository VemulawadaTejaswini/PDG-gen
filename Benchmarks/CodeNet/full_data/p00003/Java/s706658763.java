class ACM1 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,mid=0;
        int n=0;
        try {
            Scanner scan=new Scanner(System.in);
            n=scan.nextInt();
            for (int i = 0; i < n; i++) {
                int temp=scan.nextInt();
                min=max=mid=temp*temp;
                for (int j = 0; j < 2; j++) {    
                    temp=scan.nextInt();
                    if(temp*temp<min){
                         min=temp*temp;
                    }
                    else if(temp*temp>max){
                       mid=max;
                       max=temp*temp;
                    }
                    else{
                        mid=temp*temp;
                    }
                }
                if(min+mid==max){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }
        catch(Exception exp){
            
        }
}
}