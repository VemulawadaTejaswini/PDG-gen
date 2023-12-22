import java.util.*;

class Index {
    String word;
    ArrayList<Integer> pages;

    Index(String word) {
        this.word = word;
        pages = new ArrayList<Integer>();
    }

    void addPage(int page) {
        pages.add(page);
        Collections.sort(pages);
    }

    void printPages() {
        for(int i = 0; i < pages.size(); i++) {
            if (i != pages.size()) {
                System.out.printf("%d ", pages.get(i));
            } else {
                System.out.printf("%d\n", pages.get(i));
            }
        }
        System.out.println("");
    }
}

class Main {


    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Index> indices = new ArrayList<Index>();

        while (sc.hasNext()) {
            String [] line = sc.nextLine().split(" ");
            boolean found = false;
            for (Index ind : indices) {
                if (ind.word.equals(line[0])) {
                    found = true;
                    ind.addPage(Integer.parseInt(line[1]));
                    break;
                }
            }
            if (!found) {
                Index newInd = new Index(line[0]);
                newInd.addPage(Integer.parseInt(line[1]));
                indices.add(newInd);
            }
        }

        ArrayList<String> words = new ArrayList<String>();
        
        for (Index ind : indices) {
            words.add(ind.word);
        }

        Collections.sort(words);

        for (String w : words) {
            for (Index ind : indices) {
                if (w.equals(ind.word)) {
                    System.out.println(w);
                    ind.printPages();
                }
            }
        }

    }
}