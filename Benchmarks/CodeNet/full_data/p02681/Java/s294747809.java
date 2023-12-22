public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        System.out.println(compare(s,t));
    }


    public static boolean compare(String S , String T){
        char[] chars1 = S.toCharArray();
        char[] chars2 = T.toCharArray();
        if(chars1.length>=chars2.length) return false;
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i]!=chars2[i]) return false;
        }
        return true;
    }
}
