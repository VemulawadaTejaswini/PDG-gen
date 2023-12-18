public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int ret = 0;
        char[] exps = args[0].toCharArray();
        for (char exp : exps) {
            if(exp == '+')
                ret++;
            else if(exp == '-')
                ret--;
            else
                assert false;
        }
        System.out.print(ret);
    }

}
