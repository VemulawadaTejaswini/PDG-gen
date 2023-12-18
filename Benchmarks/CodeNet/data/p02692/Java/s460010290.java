
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();

        HashMap<String, Choice> map = new HashMap<>();
        ABC a = new ABC(scan.nextInt(), "A");
        ABC b = new ABC(scan.nextInt(), "B");
        ABC c = new ABC(scan.nextInt(), "C");
        map.put("AB", new Choice("AB", new ABC[]{a, b, c}));
        map.put("BC", new Choice("BC", new ABC[]{b, c, a}));
        map.put("AC", new Choice("AC", new ABC[]{a, c, b}));

        scan.nextLine();
        String[] inputs = new String[total];
        for (int i = 0; i < total; i++) {
            inputs[i] = scan.nextLine();
        }

        StringBuffer outPut=new StringBuffer();
        boolean ok=true;
        for (int i = 0; i < total; i++) {
            Choice choice = map.get(inputs[i]);
            String out;
            if (i < total - 1) {
                out = choice.autoChoose(map.get(inputs[i + 1]));
            } else {
                out = choice.autoChoose(null);
            }
            if (out == null) {
                ok=false;
                break;
            }
            outPut.append(out).append(System.getProperty("line.separator"));
        }
        if(ok){
            System.out.println("Yes");
            System.out.print(outPut);
        }else {
            System.out.println("No");
        }
    }
}

class ABC {
    int num;
    String id;

    public ABC(int num, String id) {
        this.num = num;
        this.id = id;
    }

    public boolean lessThen(ABC one) {
        return this.num < one.num;
    }
}

class Choice {
    public Choice(String type, ABC[] abc) {
        this.type = type;
        this.abc = abc;
    }

    String type;
    ABC[] abc;

    public String choose(int choice) {
        abc[choice].num++;
        abc[1 - choice].num--;
        return String.valueOf(type.charAt(choice));
    }

    public String autoChoose(Choice next) {
        int chooseNum;
        if (abc[0].num == 1 && abc[1].num == 1 && abc[2].num == 0) {
            if (next == null) {
                chooseNum = 0;
            } else {
                if (abc[0] == next.abc[0] || abc[0] == next.abc[1]) {
                    chooseNum = 0;
                } else {
                    chooseNum = 1;
                }
            }
        } else {
            if (abc[0].lessThen(abc[1])) {
                chooseNum = 0;
            } else {
                chooseNum = 1;
            }
        }
        String ret = choose(chooseNum);
        if (abc[0].num < 0 || abc[1].num < 0 || abc[2].num < 0) {
            ret = null;
        }
        return ret;
    }
}
