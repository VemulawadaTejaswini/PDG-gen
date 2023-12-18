package main

import (
	"fmt"
	"time"
)

const (
	yyyymmdd = "2006/01/02"
)

func main() {
	var dateS, res string
	_, _ = fmt.Scan(&dateS)
	res = solveA(dateS)
	fmt.Println(res)
}

func solveA(dateS string) string {

	t1, _ := time.Parse(yyyymmdd, dateS)
	t2, _ := time.Parse(yyyymmdd, "2019/04/30")

	if t1.Unix() <= t2.Unix() {
		return "Heisei"
	} else {
		return "TBD"
	}
}
