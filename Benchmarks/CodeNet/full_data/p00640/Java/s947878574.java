import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int w = sc.nextInt();
            int h = sc.nextInt();
            Page pages[] = new Page[n];
            Map<String, Integer> index = new HashMap<String, Integer>();
            // ページの作成
            for (int i = 0; i < n; i++) {
                String pagename = sc.next();
                int b = sc.nextInt();
                index.put(pagename, i);
                pages[i] = new Page(pagename, b);
                for (int j = 0; j < b; j++) {
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    String linkname = sc.next();
                    pages[i].mkBottan(j, x1, y1, x2, y2, linkname);
                }
            }
            int it = 0;
            int ord_num = sc.nextInt();
            int back = 0;
            int forward = 0;
            for (int i = 0; i < ord_num; i++) {
                String ordname = sc.next();
                if (ordname.equals("click")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    String linkedplace = pages[it].pageClicked(x, y);
                    int next = index.get(linkedplace);
                    if (next != it) {
                        pages[it].setForwardPage(pages[next].getPageName());
                        pages[next].setBackPage(pages[it].getPageName());
                        it = next;
                    }

                }

                else if (ordname.equals("back")) {
                    String linkedplace = pages[it].goBackPage();
                    if (linkedplace != null) {
                        it = index.get(linkedplace);
                    }
                } else if (ordname.equals("forward")) {
                    String linkedplace = pages[it].goForwardPage();
                    if (linkedplace != null) {
                        it = index.get(linkedplace);
                    }
                } else if (ordname.equals("show")) {
                    System.out.println(pages[it].getPageName());
                }
            }

        }
    }
}

class Page {
    private String pagename;
    private Bottan[] bottans;
    private int bottan_number;
    private String back = "";
    private String forward = "";

    Page(String pagename, int b) {
        this.pagename = pagename;
        this.bottan_number = b;
        bottans = new Bottan[b];
    }

    void mkBottan(int bnum, int x1, int y1, int x2, int y2, String linkname) {
        bottans[bnum] = new Bottan(x1, y1, x2, y2, linkname);
    }

    String pageClicked(int x, int y) {
        String jump = this.pagename;
        for (int i = 0; i < bottan_number; i++) {
            if (bottans[i].isInBottan(x, y)) {
                jump = bottans[i].getLinkName();
                break;
            }
        }
        return jump;
    }

    String getPageName() {
        return pagename;
    }

    String goBackPage() {
        return back;
    }

    String goForwardPage() {
        return forward;
    }

    void setBackPage(String back) {
        this.back = back;
    }

    void setForwardPage(String forward) {
        this.forward = forward;
    }

}

class Bottan {
  private  String linkname;
  private  Rectangle bottan;

    Bottan(int x1, int y1, int x2, int y2, String linkname) {
        this.linkname = linkname;
        bottan = new Rectangle(x1, y1, x2 - x1+1, y2 - y1+1);
    }

    boolean isInBottan(int x, int y) {
        return bottan.contains(x, y);
    }

    String getLinkName() {
        return linkname;
    }
}