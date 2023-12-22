import java.util.*;

public class Main {
    private static final String EOF = "X";

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String[] line = null;
            while((line = scn.nextLine().split(" ")) != null && !line[1].equals(EOF)) {
                System.out.println(encode(decode(line[0]), line[1]));
            }
        }
    }

    private static String[] decode(String str) {
        String[] rslt = null;
        if(str.indexOf("_") >= 0) {
            rslt = decodeSnake(str);
        } else {
            if(Character.isUpperCase(str.charAt(0))) {
                rslt = decodePascal(str);
            } else {
                rslt = decodeCamel(str);
            }
        }
        return rslt;
    }

    private static String[] decodePascal(String str) {
        return decodeCamel(str);
    }

    private static String[] decodeCamel(String str) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                list.add(str.substring(0, i).toLowerCase());
                str = str.substring(i);
                i = 1;
            }
        }
        list.add(str.toLowerCase());
        return list.toArray(new String[0]);
    }

    private static String[] decodeSnake(String str) {
        return str.split("_");
    }

    private static String encode(String[] words, String op) {
        String rslt = null;
        switch(op) {
          case "U":
            rslt = encodePascal(words);
            break;
          case "L":
            rslt = encodeCamel(words);
            break;
          case "D":
            rslt = encodeSnake(words);
            break;
          default:
            assert false;
        }
        return rslt;
    }

    private static String encodePascal(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)) + word.substring(1));
        }
        return sb.toString();
    }

    private static String encodeCamel(String[] words) {
        StringBuilder sb = new StringBuilder(words[0]);
        for(int i = 1; i < words.length; i++) {
            sb.append(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1));
        }
        return sb.toString();
    }

    private static String encodeSnake(String[] words) {
        StringBuilder sb = new StringBuilder(words[0]);
        for(int i = 1; i < words.length; i++) {
            sb.append("_" + words[i]);
        }
        return sb.toString();
    }
}