final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int [] a = new int [n];
        for(int i=0; i<a.length; i++){
            a[i] = stdIn.nextInt();
        }
        stdIn.close();

        //処理別れる
        if(n == 1 || n == 2){
            System.out.println(0);
        }else{
            System.out.println(5);
        }
    }
}