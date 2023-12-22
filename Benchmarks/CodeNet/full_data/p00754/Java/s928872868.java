public class TheBalanceoftheWorld{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String line;
        int number_round, number_square, p;
        char[] sentence;
        outer:
        while(!(line = sc.nextLine()).equals(".")){
            char[] check_stack = new char[200];
            number_round = 0;
            number_square = 0;
            p = 1;
            sentence = line.toCharArray();
            for(char tmp: sentence){
                if(tmp == '('){
                    check_stack[p++] = '(';
                    number_round++;
                }
                else if(tmp == ')'){
                    if(check_stack[--p] != '('){
                        System.out.println("no");
                        continue outer;
                    }
                    number_round--;
                }
                else if(tmp == '['){
                    check_stack[p++] = '[';
                    number_square++;
                }
                else if(tmp == ']'){
                    if(check_stack[--p] != '['){
                        System.out.println("no");
                        continue outer;
                    }
                    number_square--;
                }
                if(number_round < 0 || number_square < 0){
                    System.out.println("no");
                    continue outer;
                }
            }
            if(number_round == 0 || number_square == 0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}