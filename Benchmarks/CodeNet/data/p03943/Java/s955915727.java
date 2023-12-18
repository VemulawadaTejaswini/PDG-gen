package com.oshima.source.contest.q3;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        new Main().resolve(sc);
    }

    public void resolve(Scanner sc) {
        String row1st = sc.next();
        String[] rowArr = row1st.split(" ");
        int width = Integer.parseInt(rowArr[0]);
        int height = Integer.parseInt(rowArr[1]);
        int pointCnt = Integer.parseInt(rowArr[2]);

        // 初期化
        Board board = new Board(width, height);
        int rowCnt = 0;
        while (rowCnt < pointCnt) {
            String row = sc.next();
            String[] splited = row.split(" ");
            int x = Integer.parseInt(splited[0]);
            int y = Integer.parseInt(splited[1]);
            int a = Integer.parseInt(splited[2]);

            Painter p = Factory.createPainter(a);
            board.painted(p, x, y);
            rowCnt++;
        }
        System.out.println(board.area());
    }

    public static class Board {

        private final boolean[][] board;

        public Board(int w, int h) {
            board = new boolean[w][h];
        }
        
        public void painted(Painter p, int x, int y) {
            p.paint(this, x, y);
        }
        
        public int area() {
            int xCounter = 0;
            int yCounter = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[0][j]) {
                        yCounter++;
                    }
                }
                if (board[i][0]) {
                    xCounter++;
                }
            }
            return xCounter * yCounter;
        }
    }

    public static interface Painter {

        public void paint(Board b, int x, int y);
    }

    public static class Factory {

        static final Painter PAINTER_A = (b, x, y) -> {
            for (int i = 0; i < b.board.length; i++) {
                for (int j = 0; j < b.board[i].length; j++) {
                    
                    if (i < x) {
                        b.board[i][j] = true;
                    }
                }
            }
        };
        static final Painter PAINTER_B = (b, x, y) -> {
            for (int i = 0; i < b.board.length; i++) {
                for (int j = 0; j < b.board[i].length; j++) {
                    
                    if (i > x) {
                        b.board[i][j] = true;
                    }
                }
            }
        };
        static final Painter PAINTER_C = (b, x, y) -> {
            for (int i = 0; i < b.board.length; i++) {
                for (int j = 0; j < b.board[i].length; j++) {
                    
                    if (i < y) {
                        b.board[i][j] = true;
                    }
                }
            }
        };
        static final Painter PAINTER_D = (b, x, y) -> {
            for (int i = 0; i < b.board.length; i++) {
                for (int j = 0; j < b.board[i].length; j++) {
                    
                    if (i > y) {
                        b.board[i][j] = true;
                    }
                }
            }
        };

        public static Painter createPainter(int pattern) {

            switch (pattern) {
                case 1:
                    return PAINTER_A;
                case 2:
                    return PAINTER_B;
                case 3:
                    return PAINTER_C;
                case 4:
                    return PAINTER_D;
                default:
                    return null;
            }
        }
    }
}
