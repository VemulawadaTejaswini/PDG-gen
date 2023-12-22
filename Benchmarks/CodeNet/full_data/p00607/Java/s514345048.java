import java.util.Scanner;

public class EditText {
    static final int MAXINPUTLINE = 10;
    static final int MAXINPUTCOMMAND = 300;
    static final int MAXMODIFIEDTEXTLINE = 100;
    static final int MAXMODIFIERTEXTCHAR = 1000;
    static String[] modifyingText = new String[MAXMODIFIEDTEXTLINE];
    static String buffer;
    static int cursorLocLine = 0;
    static int cursorLocRow = 0;

    public static void main(String args[]) {
        String inputText[];
        String inputCommand[];

        inputText = giveTextLine();
        inputCommand = giveCommand();
        modifyText(inputText, inputCommand);

        for(int i = 0; i < modifyingText.length; i++){
            System.out.println(modifyingText[i]);
        }
    }

    private static String[] giveTextLine() {
        String input;
        String[] inputText = new String[MAXINPUTLINE];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTLINE; i++) {
            input = scan.next();
            if (input.equals("END_OF_TEXT")) break;
            inputText[i] = input;
        }
        return inputText;
    }

    private static String[] giveCommand() {
        String input;
        String[] inputCommand = new String[MAXINPUTCOMMAND];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTCOMMAND; i++) {
            input = scan.next();
            if (input.equals("-")) break;
            inputCommand[i] = input;
        }
        return inputCommand;
    }

    private static void modifyText(final String inputText[], final String inputCommand[]) {

        for (int i = 0; i < inputText.length; i++) {
            modifyingText[i] = inputText[i];
        }

        for (int i = 0; i < inputCommand.length; i++) {
            if (inputCommand[i].equals("a")) editA();
            else if (inputCommand[i].equals("e")) editE();
            else if (inputCommand[i].equals("p")) editP();
            else if (inputCommand[i].equals("n")) editN();
            else if (inputCommand[i].equals("f")) editF();
            else if (inputCommand[i].equals("b")) editB();
            else if (inputCommand[i].equals("d")) editD();
            else if (inputCommand[i].equals("k")) editK();
            else if (inputCommand[i].equals("y")) editY();
        }
    }

    private static String remove(String str, int removeIndex) {
        return str.substring(0, removeIndex) + str.substring(removeIndex + 1);
    }

    private static String insert(String str, int insertIndex) {
        return str.substring(0, insertIndex) + buffer + str.substring(insertIndex);
    }

    private static void editA() {
        cursorLocRow = 0;
    }

    private static void editE() {
        cursorLocRow = modifyingText[cursorLocLine].length();
    }

    private static void editP() {
        cursorLocRow = 0;
        if (cursorLocLine > 0) cursorLocLine--;
    }

    private static void editN() {
        cursorLocRow = 0;
        if (modifyingText[cursorLocLine + 1] != null) cursorLocLine++;
    }

    private static void editF() {
        if (modifyingText[cursorLocLine].length() == cursorLocRow + 1) {
            cursorLocLine++;
            cursorLocRow = 0;
        } else {
            cursorLocRow++;
        }
    }

    private static void editB() {
        if (cursorLocRow > 0) cursorLocRow--;
        else {
            cursorLocRow = modifyingText[cursorLocLine - 1].length() - 1;
            cursorLocLine--;
        }
    }

    private static void editD() {
        if (cursorLocRow != modifyingText[cursorLocLine].length() - 1) {
            modifyingText[cursorLocLine] = remove(modifyingText[cursorLocLine], cursorLocRow);
        } else if (modifyingText[cursorLocLine + 1] != null) {
            for (int i = cursorLocLine; i < modifyingText.length; i++) {
                if (modifyingText[i + 1] == null) break;
                modifyingText[i] += modifyingText[i + 1];
            }
        }

    }

    private static void editK() {
        if (cursorLocRow == modifyingText[cursorLocLine].length() - 1 && modifyingText[cursorLocLine + 1] != null) {
            for (int i = cursorLocLine; i < modifyingText.length; i++) {
                if (modifyingText[i + 1] == null) break;
                modifyingText[i] += modifyingText[i + 1];
            }
            buffer = "\n";
        } else {
            buffer = modifyingText[cursorLocLine].substring(cursorLocRow);
            modifyingText[cursorLocLine] = modifyingText[cursorLocLine].substring(0, cursorLocRow - 1);
        }
    }

    /**
     * 　yank
     */
    private static void editY() {
        if(buffer.equals("\n")) {
            String movingText = modifyingText[cursorLocLine].substring(cursorLocRow);
            modifyingText[cursorLocLine] = modifyingText[cursorLocLine].substring(0, cursorLocRow-1);
            for( int i = modifyingText.length; i != cursorLocLine; i-- ){
                if(modifyingText[cursorLocLine] != null)
                    modifyingText[cursorLocLine+1] = modifyingText[cursorLocLine];
            }
            cursorLocLine++;
            cursorLocRow = 0;
        }else if (buffer != null){
            modifyingText[cursorLocLine] = insert(modifyingText[cursorLocLine], cursorLocRow);
        }
    }

}
