class Main {

    private int getDigitOfSum(int a, int b){ return getDigitOfSumRecursive(a,b); }
    private int getDigitOfSumRecursive(int a, int b){
        int sum = a+b;
        return ( sum/10==0 ? 1 : 1+getDigitOfSumRecursive(sum/10, 0) );
    }

    public static void main(String[] args){
        if(args.length < 2){ return; }
        Main main = new Main();
        try{
            System.out.println(
                main.getDigitOfSum(
                    Integer.parseInt( args[0] ),
                    Integer.parseInt( args[1] )
                )
            );
        }
        catch(NumberFormatException e){ }
    }
}