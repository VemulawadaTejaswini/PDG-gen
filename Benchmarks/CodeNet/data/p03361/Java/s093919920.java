import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h, w;
        char s = '#';
        char d = '.';
        char matrix[][];
        int count = 0;
        String str = "Yes";
        String temp;

        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();

        matrix = new char[h][w];

        for (int i = 0; i < h; i++) {
            temp = sc.next();
            matrix[i] = temp.toCharArray();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j+1] == '.') {
                                str = "No";
                            }
                        }
                    }
                    else if (j != w - 1){
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j+1] == '.' && matrix[i][j-1] == '.') {
                                str = "No";
                            }
                        }
                    } else {
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j-1] == '.') {
                                str = "No";
                            }
                        }
                    }
                } 
                else if (i != h - 1) {
                    if (j == 0) {
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j+1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    }
                    else if (j != w - 1){
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j+1] == '.' && matrix[i][j-1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    } else {
                        if (matrix[i][j] == '#') {
                            if (matrix[i+1][j] == '.' && matrix[i][j-1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    }
                }
                else {
                    if (j == 0) {
                        if (matrix[i][j] == '#') {
                            if (matrix[i][j+1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    }
                    else if (j != w - 1){
                        if (matrix[i][j] == '#') {
                            if (matrix[i][j+1] == '.' && matrix[i][j-1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    } else {
                        if (matrix[i][j] == '#') {
                            if (matrix[i][j-1] == '.' && matrix[i-1][j] == '.') {
                                str = "No";
                            }
                        }
                    }
                }
            }
        }
        System.out.println(str);
    }
}
