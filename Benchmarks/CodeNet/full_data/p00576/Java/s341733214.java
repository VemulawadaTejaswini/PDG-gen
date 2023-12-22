import java.util.*;

class Piece {
    private int position;

    public Piece() {

    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    public int getPosition() {
        return this.position;
    }

    public void movePosition() {
        this.position++;
    }
}

class Rule {
    public Rule() {

    }

    public void movePiece(Piece piece1, Piece piece2) {
        int pos1 = piece1.getPosition();
        int pos2 = piece2.getPosition();

        if (pos1 + 1 != pos2) {
            piece1.movePosition();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int MAX_POS = 2020;

        Rule rule = new Rule();
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Piece[] pieces = new Piece[N + 2];
        for (int i = 1; i <= N; i++) {
            int X = Integer.parseInt(sc.next());
            pieces[i] = new Piece();
            pieces[i].setPosition(X);
        }
        
        pieces[N + 1] = new Piece();
        pieces[N + 1].setPosition(MAX_POS);

        int M = Integer.parseInt(sc.next());
        for (int i = 0; i < M; i++) {
            int A = Integer.parseInt(sc.next());
            rule.movePiece((pieces[A]), pieces[A + 1]);
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(pieces[i].getPosition());
        }
    }
}

