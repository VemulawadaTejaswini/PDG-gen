//import javafx.util.Pair;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: Harry
 * @Date: 2019-11-16
 * @Version 1.0
 */
public class Main {

    static int arr[],t,n,arr2[];

    //    static int x[],y[];
    static BigInteger mod = new BigInteger(String.valueOf(1000000000 + 7));
    static BigInteger inv[];


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inv = new BigInteger[1000000 + 5];
        getinv(1000000 + 3);

        while(input.hasNext()){
            int x = input.nextInt();
            int y = input.nextInt();

            int xx = Math.min(x,y);
            int yy = Math.max(x,y);

            int twoNum = xx / 2;
            int oneNum = xx % 2;


//            System.out.println(xsum(twoNum,oneNum) + " " + ysum(twoNum,oneNum));
//            System.out.println(twoNum + " " + oneNum);

            boolean falg = false;
            BigInteger ans = BigInteger.ZERO;
            while(twoNum != 0){
                if(xsum(twoNum,oneNum) == xx && ysum(twoNum,oneNum) == yy){
//                    System.err.println(twoNum + " " + oneNum);
                    ans = cal(twoNum,oneNum);
                    break;
                }

                twoNum--;
                oneNum += 2;
            }

            System.out.println(ans);
        }



    }

    public static void getinv(int n) {
        inv[1]=BigInteger.ONE;
        inv[0]=BigInteger.ONE;
        for(int i=2; i<n; i++){
            inv[i] = BigInteger.ONE.
                    multiply(mod.subtract(mod.divide(new BigInteger(String.valueOf(i)))))
                    .multiply(inv[Integer.valueOf(mod.mod(new BigInteger(String.valueOf(i))).toString())])
                    .mod(mod);
        }

    }

    public static BigInteger cal(int twoNum,int oneNum){
        int min2 = Math.min(twoNum,oneNum);
        int max2 = Math.min(twoNum,oneNum);

        return cal2(new BigInteger(String.valueOf(min2)),new BigInteger(String.valueOf(max2)));
    }

    public static BigInteger cal2(BigInteger m,BigInteger n){
        Stack<Pair> stack = new Stack<>();

        stack.add(new Pair(m,n));

        BigInteger ans = null;
        while (!stack.empty()){
            Pair pair = stack.peek();

            m = pair.getKey();
            n = pair.getValue();

            if(m.equals(BigInteger.ZERO) || n.equals(BigInteger.ZERO)){
                ans = BigInteger.ONE;
                stack.pop();

                while(!stack.empty()){

                    pair = stack.peek();
                    m = pair.getKey();
                    n = pair.getValue();

//                    ans = ans.multiply(m.add(n))
//                            .multiply(m.add(n).subtract(BigInteger.ONE))
//                            .divide(m)
//                            .divide(n);

                    ans = ans.multiply(m.add(n)).mod(mod)
                            .multiply(m.add(n).subtract(BigInteger.ONE)).mod(mod)
                            .multiply(inv[Integer.valueOf(m.toString())]).mod(mod)
                            .multiply(inv[Integer.valueOf(n.toString())]).mod(mod);
//                    System.out.println("@ " + stack.size());
//                    System.out.println("ans:" + ans);
                    stack.pop();
                }
//                System.out.println("@! " + stack.size());
            }
            else{
                stack.push(new Pair(m.subtract(BigInteger.ONE),n.subtract(BigInteger.ONE)));
            }
        }

        return ans;
    }

    public static int xsum(int twoNum,int oneNum){
        return twoNum * 2 + oneNum;
    }

    public static int ysum(int twoNum,int oneNum){
        return oneNum * 2 + twoNum;
    }





    public static class Pair{
        BigInteger key,value;

        Pair(){

        }

        Pair(BigInteger key,BigInteger val){
            this.key = key;
            this.value = val;
        }

        public BigInteger getKey() {
            return key;
        }

        public void setKey(BigInteger key) {
            this.key = key;
        }

        public BigInteger getValue() {
            return value;
        }

        public void setValue(BigInteger value) {
            this.value = value;
        }
    }













}