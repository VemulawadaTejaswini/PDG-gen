import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ","");
        str = str.replace(".","");
        int i;
        int[] count = new int[26];
        for(i=0;i<26;i++) count[i] = 0;
        while(true){
            str = str.toLowerCase();
            for(i=0;i<str.length();i++){
                int value = (int)str.charAt(i);
                count[value-97]++;
            }
            str = sc.nextLine().replace(" ","");
            str = str.replace(".","");
            if(str.equals("")) break;
        }
        for(i=0;i<26;i++){
            System.out.println((char)('a'+i) + " : " + count[i]);
        }
    }
}
