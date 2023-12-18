package main

import "fmt"

func main() {
	var a, b, c int
	fmt.Scan(&a, &b, &c)

	s := []int{a+b, b+c, c+a}
	min := s[0]
	for _, i := range s {
		if i < min {
			min = i
		}
	}
	fmt.Println(min)
}