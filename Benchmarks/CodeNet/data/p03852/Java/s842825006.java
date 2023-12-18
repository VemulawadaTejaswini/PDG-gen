public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextString(); //
        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String u = "u";
        if(c == a || c == e || c == i || c == o || c == u){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");        
        }
    }
}
