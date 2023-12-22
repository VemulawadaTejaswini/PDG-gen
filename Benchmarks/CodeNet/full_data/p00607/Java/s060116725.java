import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int MAXINPUTLINE = 10;
    static final int MAXINPUTCOMMAND = 300;
    static final int MAXMODIFIEDTEXTLINE = 100;
    static final int MAXMODIFIERTEXTCHAR = 1000;
    static ArrayList<String> modifyingText = new ArrayList<String>();
    static String buffer;
    static int cursorLocLine = 0;
    static int cursorLocRow = 0;

    public static void main(String args[]) {
        ArrayList<String> inputText;
        ArrayList<String> inputCommand;

        inputText = giveTextLine();
        inputCommand = giveCommand();
        modifyText(inputText, inputCommand);

        for(int i = 0; i < modifyingText.size(); i++){
            System.out.println(modifyingText.get(i));
        }
    }

    private static ArrayList<String> giveTextLine() {
        String input;
        ArrayList<String>inputText = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTLINE; i++) {
            input = String.valueOf(scan.next());
            if (input.equals("END_OF_TEXT")) break;
            inputText.add(i, input);
        }
        return inputText;
    }

    private static ArrayList<String> giveCommand() {
        String input;
        ArrayList<String>inputCommand = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTCOMMAND; i++) {
            input = String.valueOf(scan.next());
            if (input.equals("-")) break;
            inputCommand.add(i, input);
        }
        return inputCommand;
    }

    private static void modifyText(final ArrayList<String> inputText, final ArrayList<String> inputCommand) {

        for (int i = 0; i < inputText.size(); i++) {
            modifyingText.add(i, inputText.get(i));
        }

        for (int i = 0; i < inputCommand.size(); i++) {
            if (inputCommand.get(i).equals("a")) editA();
            else if (inputCommand.get(i).equals("e")) editE();
            else if (inputCommand.get(i).equals("p")) editP();
            else if (inputCommand.get(i).equals("n")) editN();
            else if (inputCommand.get(i).equals("f")) editF();
            else if (inputCommand.get(i).equals("b")) editB();
            else if (inputCommand.get(i).equals("d")) editD();
            else if (inputCommand.get(i).equals("k")) editK();
            else if (inputCommand.get(i).equals("y")) editY();
        }
    }

    private static String remove(String str, int removeIndex) {
        StringBuilder builder = new StringBuilder(str);
        return builder.deleteCharAt(removeIndex).toString();
//        return str.substring(0, removeIndex) + str.substring(removeIndex + 1);
    }

    private static String insert(String str, int insertIndex) {
        StringBuilder builder = new StringBuilder(str);
        return builder.insert(insertIndex, buffer).toString();
//        return str.substring(0, insertIndex) + buffer + str.substring(insertIndex);
    }

    private static void editA() {
        cursorLocRow = 0;
    }

    private static void editE() {
        cursorLocRow = modifyingText.get(cursorLocLine).length();
    }

    private static void editP() {
        cursorLocRow = 0;
        if (cursorLocLine > 0) cursorLocLine--;
    }

    private static void editN() {
        cursorLocRow = 0;
        if (modifyingText.get(cursorLocLine + 1) != null) cursorLocLine++;
    }

    private static void editF() {
        if (modifyingText.get(cursorLocLine).length() == cursorLocRow + 1) {
            cursorLocLine++;
            cursorLocRow = 0;
        } else {
            cursorLocRow++;
        }
    }

    private static void editB() {
        if (cursorLocRow > 0) cursorLocRow--;
        else {
            cursorLocRow = modifyingText.get(cursorLocLine - 1).length() - 1;
            cursorLocLine--;
        }
    }

    private static void editD() {
        if (cursorLocRow != modifyingText.get(cursorLocLine).length() - 1) {
            modifyingText.add(cursorLocLine, remove(modifyingText.get(cursorLocLine), cursorLocRow));
        } else if (modifyingText.get(cursorLocLine + 1) != null) {
            for (int i = cursorLocLine; i < modifyingText.size(); i++) {
                if (modifyingText.get(i + 1) == null) break;
                modifyingText.add(i, modifyingText.get(i) + modifyingText.get(i + 1));
            }
        }

    }

    private static void editK() {
        if (cursorLocRow == modifyingText.get(cursorLocLine).length() - 1 && modifyingText.get(cursorLocLine + 1) != null) {
            for (int i = cursorLocLine; i < modifyingText.size(); i++) {
                if (modifyingText.get(i + 1) == null) break;
                modifyingText.add(i, modifyingText.get(i) + modifyingText.get(i + 1));
            }
            buffer = "\n";
        } else {
            buffer = modifyingText.get(cursorLocLine).substring(cursorLocRow);
            modifyingText.add(cursorLocLine, modifyingText.get(cursorLocLine).substring(0, cursorLocRow - 1));
        }
    }

    private static void editY() {
        if(buffer.equals("\n")) {
            String movingText = modifyingText.get(cursorLocLine).substring(cursorLocRow);
            modifyingText.add(cursorLocLine, modifyingText.get(cursorLocLine).substring(0, cursorLocRow-1));
            for( int i = modifyingText.size(); i != cursorLocLine; i-- ){
                if(modifyingText.get(cursorLocLine) != null)
                    modifyingText.add(cursorLocLine + 1, modifyingText.get(cursorLocLine));
            }
            cursorLocLine++;
            cursorLocRow = 0;
        }else if (buffer != null){
            modifyingText.add(cursorLocLine, insert(modifyingText.get(cursorLocLine), cursorLocRow));
        }
    }

}
